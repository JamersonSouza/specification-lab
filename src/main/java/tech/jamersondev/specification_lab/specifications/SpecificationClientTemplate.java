package tech.jamersondev.specification_lab.specifications;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;
import tech.jamersondev.specification_lab.model.Client;

public class SpecificationClientTemplate {
    @And(
            {
                    @Spec(path = "name", spec = Like.class),
                    @Spec(path = "age", spec = Equal.class),
                    @Spec(path = "email", spec = Like.class)
            }

    )

    public interface ISpecificationClientTemplate extends Specification<Client>{}
}
