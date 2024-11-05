package br.com.luisedu.course.repositories;

import br.com.luisedu.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
