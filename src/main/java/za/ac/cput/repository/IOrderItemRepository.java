package za.ac.cput.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.OrderItem;

import java.util.List;
import java.util.Optional;

/**
 * IOrderItemRepository.java
 *
 * @author Rethabile Ntsekhe
 * Student Num: 220455430
 * @date 09-Sep-24
 */
@Repository
public interface IOrderItemRepository  extends JpaRepository<OrderItem, Long> {
    @Override
    void deleteById(Long id);

    List<OrderItem> findAllByOrder_Id(Long id);

}
