# Spring Security with Spring Boot

### AuthorizeRequests Configuration
SecurityConfig.java:
```
@Override
public void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
                .antMatchers("/svc/v1/private/accounts/*").hasRole("USER")
                .antMatchers("/svc/v1/private/admin/**").hasRole("ADMIN")
            .and()
                .formLogin();

}
```

### User Setting
SecurityConfig.java:
```
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
                .withUser("han").password("password").roles("USER")
            .and()
                .withUser("april").password("password").roles("USER","ADMIN");
}
```

### Test URL
Public( Doesn't need any role ):
```
http://localhost:8080/svc/v1/public/accounts/{accountNumber}
```
Private( need a USER role): han/password
```
http://localhost:8080/svc/v1/private/accounts/{accountNumber}
```
Private Extra( need a ADMIN role ): april/password
```
http://localhost:8080/svc/v1/private/admin/accounts/{accountNumber}
```


## Author

This example was created by [Han Jung](http://mhanjung.github.io).