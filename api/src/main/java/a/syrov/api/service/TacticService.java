package a.syrov.api.service;

import a.syrov.api.dao.TacticDAO;
import a.syrov.api.entity.Tactic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacticService {
    private final TacticDAO tacticDAO;

    public TacticService(TacticDAO tacticDAO) {
        this.tacticDAO = tacticDAO;
    }

    public Tactic createTactic(Tactic tactic) {
        return tacticDAO.save(tactic);
    }

    public List<Tactic> getAllTactics() {
        return tacticDAO.findAll();
    }

    public Tactic findById(Long id) {
        return tacticDAO.findById(id).orElse(null);
    }
}
