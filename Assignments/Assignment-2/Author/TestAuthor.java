class TestAuthor {
  public static void main(String[] args) {
    Author a = new Author("Valerie Plante", "vplante@email.com", 'm');
    a.setEmail("Valerie.Plante@newEmail.com");
    System.out.println(a.toString());
    System.out.println(a.getGender());
  }
}