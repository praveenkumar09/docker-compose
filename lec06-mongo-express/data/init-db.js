db = db.getSiblingDB("product-service");

db.createCollection("products");

db.products.insertMany([
  {
    name: "Sample Product 1",
    price: 29.99,
    category: "electronics",
    stock: 100,
    createdAt: new Date(),
  },
  {
    name: "Sample Product 2",
    price: 49.99,
    category: "clothing",
    stock: 50,
    createdAt: new Date(),
  },
]);
