
    package com.myapp;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;
    
    @RestController
    public class UserController {
        
        private UserService userService;
        
        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }
        
        @PostMapping("/users")
        public User registerUser(@RequestBody User user) {
            return userService.registerUser(user);
        }
        
        @GetMapping("/users/{id}/verify")
        public boolean verifyUser(@PathVariable Long id) {
            User user = userService.getUserById(id);
            return userService.verifyUser(user);
        }
        
    }
