package br.com.fiap.controleacesso.service;

import br.com.fiap.controleacesso.model.RegisterRequest;
import br.com.fiap.controleacesso.entity.User;
import br.com.fiap.controleacesso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(RegisterRequest registerRequest) {
        User user = new User();
        user.setName(registerRequest.getName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        // Adicione aqui mais lógica conforme necessário, como verificar se o usuário já existe
        userRepository.save(user);
    }
}
