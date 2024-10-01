package com.interview.distribution.infra.repository;

import com.interview.distribution.infra.repository.InsertModel;
import com.interview.distribution.infra.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Component
public class InsertRepository implements Repository<InsertModel, Long> {

    private final Set<InsertModel> inserts = new HashSet<>();

    @Override
    public InsertModel get(Long key) {
        return inserts.stream()
            .filter(model -> model.getId().equals(key))
            .findFirst()
            .orElse(null);
    }

    @Override
    public Collection<InsertModel> getAll() {
        return inserts;
    }

    @Override
    public InsertModel update(InsertModel insertModel) {
        InsertModel currentModel = get(insertModel.getId());
        if (currentModel != null) {
            inserts.remove(currentModel);
            return create(new InsertModel(
                currentModel.getId(),
                insertModel.getFileId(),
                insertModel.getDestinationPath(),
                insertModel.getConnectionType()
            ));
        }
        return null;
    }

    @Override
    public InsertModel create(InsertModel insertModel) {
        inserts.add(insertModel);
        return insertModel;
    }
}