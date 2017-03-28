package ua.com.jon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.jon.domain.CostItem;

/**
 * Created by b.chupika on 28.03.2017
 */
public interface CostItemRepository extends JpaRepository<CostItem, Long> {

}
