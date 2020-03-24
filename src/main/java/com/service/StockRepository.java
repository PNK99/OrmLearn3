package com.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	@Query("SELECT s FROM Stock s  WHERE MONTH(s.date) = 9 AND YEAR(s.date) = 2019")
	public List<Stock> getSeptemberStocks();
	
	@Query("SELECT s FROM Stock s WHERE s.code = 'GOOGL' AND s.close > 1250")
	public List<Stock> getGoogleStocksGt1250();

	@Query("SELECT s FROM Stock s ORDER BY s.volume DESC")
	public List<Stock> getHighestVolumeStocks(Pageable pageable);
	
	@Query("SELECT s FROM Stock s WHERE s.code='NFLX' ORDER BY s.volume")
	public List<Stock> getLowestVolumeNetflixStocks(Pageable pageable);
		
}
