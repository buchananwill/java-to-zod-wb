package sh.ivan.zod.schema;

import java.util.Set;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import sh.ivan.zod.schema.attribute.Attribute;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JavaLocalTimeSchema extends Schema {
    public JavaLocalTimeSchema(Set<Attribute> attributes) {
        super(attributes);
    }

    @Override
    protected String zodType() {
        return "string().time()";
    }
}
