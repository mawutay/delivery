package com.interview.distribution.infra.repository;

import com.google.gag.annotation.enforceable.Roulette;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

@Component
public class TakedownRepository implements Repository<TakedownModel, Long> {

    private final List<TakedownModel> carpools = List.of(
        new TakedownModel(1L, 1L, "/albums/", "SFTP", "1"),
        new TakedownModel(2L, 2L, "/albums/", "CLOUD", "1"),
        new TakedownModel(3L, 3L, "/albums/", "SFTP", "1")
    );

    @Override
    public TakedownModel get(Long key) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    @Roulette(probability = 0.05, exception = IOException.class, message = "Network should be reliable")
    public Collection<TakedownModel> getAll() {
        return carpools;
    }

    @Override
    public TakedownModel update(TakedownModel takedownModel) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public TakedownModel create(TakedownModel takedownModel) {
        throw new UnsupportedOperationException("TODO");
    }
}
