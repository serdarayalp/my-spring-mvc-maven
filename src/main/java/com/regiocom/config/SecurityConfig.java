package com.regiocom.config;

/**
 * The @KeycloakConfiguration annotation is a metadata annotation that defines all annotations
 * that are needed to integrate Keycloak in Spring Security.
 * <p>
 * Registers the KeycloakAuthenticationProvider with the authentication manager.
 * <p>
 * Defines the session authentication strategy.
 * <p>
 * ... provide a session authentication strategy bean which should be of type
 * RegisterSessionAuthenticationStrategy for public or confidential applications and
 * NullAuthenticatedSessionStrategy for bearer-only applications.
 */
/*
@KeycloakConfiguration
public class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter {

    */
/**
 * Registers the KeycloakAuthenticationProvider with the authentication manager.
 *//*

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(keycloakAuthenticationProvider());
    }

    */
/**
 * Defines the session authentication strategy.
 *
 * ... provide a session authentication strategy bean which should be of type
 * RegisterSessionAuthenticationStrategy for public or confidential applications and
 * NullAuthenticatedSessionStrategy for bearer-only applications.
 *//*

    @Bean
    @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(buildSessionRegistry());
    }

    @Bean
    protected SessionRegistry buildSessionRegistry() {
        return new SessionRegistryImpl();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.authorizeRequests()
                .antMatchers("/customers*").hasRole("USER")
                .antMatchers("/admin*").hasRole("ADMIN")
                .anyRequest().permitAll();
    }
}*/
