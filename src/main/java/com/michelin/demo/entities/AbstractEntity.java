package com.michelin.demo.entities;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Serializable {
  public abstract ID getId();

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    AbstractEntity entity = (AbstractEntity) obj;
    return Objects.equals(this.getId(), entity.getId());
    // return getId() != null ? getId().equals(model.getId()) : this == o;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int hashCode() {
    return getId() != null?getId().hashCode():0;
  }
}
