package jam.jamspring;

import jam.jamspring.repository.MemberRepository;
import jam.jamspring.repository.MemoryMemberRepository;
import jam.jamspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Springconfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
