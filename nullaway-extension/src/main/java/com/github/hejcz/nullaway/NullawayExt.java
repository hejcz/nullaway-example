package com.github.hejcz.nullaway;

import com.google.auto.service.AutoService;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.uber.nullaway.LibraryModels;

@AutoService(LibraryModels.class)
public class NullawayExt implements LibraryModels {
    @Override
    public ImmutableSetMultimap<MethodRef, Integer> failIfNullParameters() {
        return ImmutableSetMultimap.of();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> explicitlyNullableParameters() {
        return ImmutableSetMultimap.of();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> nonNullParameters() {
        return ImmutableSetMultimap.<MethodRef, Integer>builder()
                .put(MethodRef.methodRef("java.io.File", "File(java.io.File,java.lang.String)"), 0)
                .build();
    }

    @Override
    public ImmutableSetMultimap<MethodRef, Integer> nullImpliesTrueParameters() {
        return ImmutableSetMultimap.of();
    }

    @Override
    public ImmutableSet<MethodRef> nullableReturns() {
        return ImmutableSet.of();
    }

    @Override
    public ImmutableSet<MethodRef> nonNullReturns() {
        return ImmutableSet.of();
    }
}
