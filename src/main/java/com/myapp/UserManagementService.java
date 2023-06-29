
    package com.myapp;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class UserManagementService {
        
        private UserRepository userRepository;
        
        @Autowired
        public UserManagementService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }
        
        public User registerUser(User user) {
            return userRepository.save(user);
        }
        
        public boolean verifyUser(User user) {
            // Check if the user's verification status is "verified"
            return user.getVerificationStatus().equals("verified");
        }
        
        public User getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
        }
        
    }
