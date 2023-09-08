package resume.resumeresuyou.repository;

import resume.resumeresuyou.domain.Resume;

import java.util.List;
import java.util.Optional;

public interface ResumeRepository {

    Resume save(Resume resume);   //save는 class단위로 모두 저장함 ????
    Optional<Resume> findById(Long id);
    Optional<Resume> findByResume(String newresume);   //findByResume는 newresume의 정보만 필요로 함
    List<Resume> findAll();
}
