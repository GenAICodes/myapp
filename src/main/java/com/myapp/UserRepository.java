
    package com.myapp;
    
    import org.springframework.data.jpa.repository.JpaRepository;
    
    public interface UserRepository extends JpaRepository<User, Long> {
        // Your complete code here
    }
