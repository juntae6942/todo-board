package backend.likelion.todos.member.domain;

import backend.likelion.todos.common.ConflictException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
// TODO [1단계] Component 빈으로 등록하세요
public class MemberValidator {

    private final MemberRepository memberRepository;

    public void validateDuplicatedUsername(String username) {
        // TODO [1단계] MemberRepository 의 특정 메서드를 사용하여,
        // TODO [1단계] 아이디의 중복을 검사하세요.
        // TODO [1단계] 중복된다면 테스트를 참고하여 적절한 예외와 메세지를 반환하세요.

    }
}
