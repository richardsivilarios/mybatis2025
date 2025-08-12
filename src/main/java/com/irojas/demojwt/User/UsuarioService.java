package com.irojas.demojwt.User;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Transactional
    public UserResponse createUser(UserRequest userRequest) {
        // Verificar si el usuario ya existe (por ejemplo, por username o email)
       
        // Construir y guardar el nuevo usuario
        Usuario newUser = Usuario.builder()
                .username(userRequest.getUsername())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .emailId(userRequest.getEmailId())
                .role(Role.USER) // Asignar rol por defecto
                .build();

        usuarioRepository.save(newUser);
        
        return new UserResponse("Usuario creado exitosamente");
    }

@Transactional
    public UserResponse updateUser(Integer id, UserRequest userRequest) {
        System.out.println(userRequest);
        Usuario user = Usuario.builder()
                .id(userRequest.getId())
                .username(userRequest.getUsername())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .role(Role.USER)
                .build();
       
        usuarioRepository.updateUsuario(id, user.getFirstName(), user.getLastName(),user.getEmailId());
        return new UserResponse("El usuario se registró satisfactoriamente");
    }

    public UserDTO getUser(Integer id) {
        Usuario user = usuarioRepository.findById(id).orElse(null);

        if (user != null) {
            UserDTO userDTO = UserDTO.builder()
                    .id(user.id)
                    .username(user.username)
                    .firstName(user.firstName)
                    .lastName(user.lastName)
                    .emailId(user.emailId)
                    .build();
            return userDTO;
        } else {
            return null;
        }
    }

    public List<UserDTO> getUsers() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UserDTO> userdto = new ArrayList<UserDTO>();
        for (Usuario usuario : usuarios) {

            UserDTO userDTO = UserDTO.builder()
                    .id(usuario.id)
                    .username(usuario.username)
                    .firstName(usuario.firstName)
                    .lastName(usuario.lastName)
                    .emailId(usuario.emailId)
                    .build();

            userdto.add(userDTO);
        }

        return userdto;

    }
     @Transactional
    public UserResponse deleteUser(UserRequest userRequest) {
        Usuario user = Usuario.builder()
                .id(userRequest.getId())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .role(Role.USER)
                .build();

        usuarioRepository.delete(user);
        ;
        return new UserResponse("El usuario se borro registró satisfactoriamente");
    }

}
