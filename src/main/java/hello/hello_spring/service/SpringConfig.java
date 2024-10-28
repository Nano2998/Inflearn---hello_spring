package hello.hello_spring.service;

import hello.hello_spring.repository.MemberRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
public class SpringConfig {

    private final MemberRepository memberRepository;

}
