package edu.citytech.cst.s23370098.dynamicpage.model;

import com.citytech.basicsecurity.SimpleEncryption;
import com.citytech.basicsecurity.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JSONUserDetails implements UserDetails {

    private boolean active;
    private String password;
    private String userId;

    private List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

    public JSONUserDetails(String userId) {
        this.userId = userId;
    }

    public JSONUserDetails(User userInfo) {
        this.userId = userInfo.getUserId();
        this.password = userInfo.getEncryptedPassword();
        this.password = SimpleEncryption.decrypt(this.password);
        this.active = !userInfo.isDisabled();

        var roles = userInfo.getRoles();
        authorities = Arrays.stream(roles)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.active;
    }
}
