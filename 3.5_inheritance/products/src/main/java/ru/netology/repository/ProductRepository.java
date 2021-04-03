package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
  private Product[] items = new Product[0];

  public void save(Product item) {
    int length = items.length + 1;
    Product[] tmp = new Product[length];
    System.arraycopy(goods, srcPos 0, tmp, desPos 0, good.length);

    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = product;
    good = tmp;
  }

  public Product[] getAll() {
    return goods;
  }

  public Product findById(int id) {
    for (Product item : goods) {
      if (item.getId() == id) {
        return item;
      }
    }
    return null;
  }

  public void removeById(int id) {
    if (this.findById(id) ==null) {
      throw new NotFoundException("Element with id: " + id + "not found");
    }

    int length = goods.length - 1;
    Product[] tmp = new Product[length];
    int index = 0;
    for (Product item : goods) {
      if (item.getId() != id) {
        tmp[index] = item;
        index++;
      }
    }
    goods = tmp;
  }
}
