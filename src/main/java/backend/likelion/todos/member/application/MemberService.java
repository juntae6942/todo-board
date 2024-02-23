package backend.likelion.todos.member.application;

import backend.likelion.todos.member.domain.Member;
import backend.likelion.todos.member.domain.MemberRepository;
import backend.likelion.todos.member.domain.MemberValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberValidator memberValidator;

    public Long signup(
            String username,
            String password,
            String nickname,
            String profileImageUrl
    ) {
        // TODO [1단계] 회원 객체를 만들고, 회원가입을 진행하세요.
        // TODO [1단계] 회원가입 시 아이디 중복 체크는 이곳에서 하지 말고, 회원의 메서드를 통해 진행되도록 합니다.
        // TODO [1단계] 중복 체크 이후 회원 정보를 저장하고, 저장된 회원의 id를 반환합니다.
        return null;
    }

    public Long login(
            String username,
            String password
    ) {
        // TODO [2단계] 저장소에서 주어진 username이라는 아이디를 갖는 회원을 찾습니다.
        // TODO [2단계] 해당 회원이 없다면 테스트를 참고하여 예외를 발생시킵니다.
        // TODO [2단계] 회원을 찾아왔다면 로그인을 진행합니다. 이때 비밀번호 비교 로직은 이곳에서 진행하지 말고 member 객체에게 시킵니다.
        // TODO [2단계] 로그인에 성공하면 회원 id를 반환합니다.
        return null;
    }
}
