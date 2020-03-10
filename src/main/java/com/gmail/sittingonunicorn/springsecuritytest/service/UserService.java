package com.gmail.sittingonunicorn.springsecuritytest.service;

import com.gmail.sittingonunicorn.springsecuritytest.repository.UserRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

//    public Optional<User> findByUserLogin (User userDTO){
//        //TODO check for user availability. password check
//        return userRepository.findByUsername(userDTO.getUsername());
//    }

//    @PostConstruct
//    public void init (){
//       if(! userRepository.findByUsername("user").isPresent()){
//
//           userRepository.save(User.builder()
//           .username("user")
//           .password("password")
//           .authorities(Role.ROLE_USER)
//           .accountNonExpired(true)
//           .accountNonLocked(true)
//           .credentialsNonExpired(true)
//           .enabled(true)
//           .build());
//       }
//    }

    @Override
    public UserDetails loadUserByUsername(@NonNull String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() ->new UsernameNotFoundException("User not found"));
    }
}
