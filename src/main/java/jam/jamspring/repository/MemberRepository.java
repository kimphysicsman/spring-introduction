package jam.jamspring.repository;

import jam.jamspring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findByid(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
