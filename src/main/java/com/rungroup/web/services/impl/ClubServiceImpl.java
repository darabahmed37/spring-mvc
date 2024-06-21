package com.rungroup.web.services.impl;

import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.models.Club;
import com.rungroup.web.repository.ClubRepository;
import com.rungroup.web.services.ClubService;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {
    private final ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    @Override
    public List<ClubDto> findAllClubs() {
        return this.clubRepository.findAll().stream().map(this::mapToClubDto).collect(Collectors.toList());
    }
    private ClubDto mapToClubDto(Club club){
        return ClubDto.builder().id(club.getId()).title(club.getTitle()).photoUrl(club.getPhotoUrl()).content(club.getContent()).createdOn(club.getCreatedOn()).updatedOn(club.getUpdatedOn()).build();}
}
