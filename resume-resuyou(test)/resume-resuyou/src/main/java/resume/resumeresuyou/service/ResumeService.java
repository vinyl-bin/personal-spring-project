package resume.resumeresuyou.service;

import resume.resumeresuyou.domain.Resume;
import resume.resumeresuyou.repository.ResumeRepository;

import java.util.List;
import java.util.Optional;

public class ResumeService {

    private final ResumeRepository resumeRepository;

    public ResumeService(ResumeRepository resumeRepository) {    //(DI)방식
        this.resumeRepository = resumeRepository;
    }

    /**
     * resume 등록(중복 가능)
     */
    public Long register(Resume resume) {

        resumeRepository.save(resume);
        return resume.getId();
    }

    /**
     * resume 조회(전체 or 특정 resume)
     */
    public List<Resume> findAllResume() {
        return resumeRepository.findAll();
    }

    public Optional<Resume> findOne(Long resumeId) {
        return resumeRepository.findById(resumeId);
    }

}
