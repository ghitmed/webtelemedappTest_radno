package com.webtelemedapp.webtelemedapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReportTmRepository extends JpaRepository<ReportTm, Long> {
  List <ReportTm> findByUserTm(UserTm userTm);

}