package am.aca.insurance.vehiclemanagement.config;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private TokenFilter tokenFilter;
//
//    @Autowired
//    private TestTokenFilter testTokenFilter;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(new AuthenticationProvider() {
//            @Override
//            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//                return null;
//            }
//
//            @Override
//            public boolean supports(Class<?> authentication) {
//                return false;
//            }
//        });
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .sessionManagement().disable()
////                .antMatcher("/internal/**").addFilter(testTokenFilter)
//                .antMatcher("/api/**").authorizeRequests().and().addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class);
//    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**");
    }
}
