package giselletech.javarocketseat.filter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import giselletech.javarocketseat.user.IUserRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Autowired
    private IUserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        // auth - username and password
        var auth = request.getHeader("Authorization");

        String authEncoded = auth.substring("Basic".length()).trim();

        // Gerar um Decode. Array de bytes
        byte[] authDecode = (Base64.getDecoder().decode(authEncoded));

        //  Converts to a string
        var authString = new String(authDecode);
        String[] credentials = authString.split(":");
        String username = credentials[0];
        String password = credentials[1];

        // validates user
        var user = this.userRepository.findByUsername(username);
        if(user == null){
            response.sendError(401);
        } else {
            // validates password
            var verifiedPassword = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword());
            if(verifiedPassword.verified){
                filterChain.doFilter(request, response);
            } else {
                response.sendError(401);
            }
        }

        System.out.println("Authorizathion");
        System.out.println(username);
        System.out.println(password);

    }
}
