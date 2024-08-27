package com.example.privatespring.configurations;

import com.example.privatespring.models.UserEntity;
import com.example.privatespring.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor
public class SecurityConfig implements UserDetailsService { //implement để override method loadUserByUsername của spring security
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //phương thức phải có dù user có muốn đăng nhập bằng email hoặc sdt -> trả về UserDetails
        UserEntity userEntity = userRepository.findByPhoneNumber(username).orElseThrow(() -> new UsernameNotFoundException(username)); //lấy info user từ dtb

        return UserPrincipal.build(userEntity);
    }
    //user's detail object

}

