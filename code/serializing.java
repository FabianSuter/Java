var person = new Person();

// Objekt serialisieren
try(var stream = new ObjectOutputStream(
                    new FileOutputStream("serial.bin"))) {
    stream.writeObject(person);}

// Objekt deserialisieren
try(var stream = new ObjectInputStream(
                    new FileInputStream("serial.bin"))) {
    Person p = (Person)stream.readObject();}
