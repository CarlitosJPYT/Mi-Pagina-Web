class persona:
  def __int__(self, nombre, apellido, edad, nacionalidad):
    self.nombre = nombre
    self.apellido = apellido
    self.edad = edad
    self.nacionalidad = nacionalidad

  def __call__(self):
    print(f"Tu nombre es: {self.nombre}")
    print(f"Tu apellido es: {self.apellido}")
    print(f"Tu edad es: {self.edad}")
    print(f"Tu nacionalidad es: {self.nacionalidad}")

class artista:
  def __init__(self, nombre, apellido, edad, nacionalidad, altura):
    persona.__init__(self, nombre, apellido, edad, nacionalidad)
    self.altura = altura

  def __call__(self):
    print(f"Mi altura es: {self.altura}")

estudiante = artista("Juan Esteban", "Prada Ospina", 24, "Medellín-Colombia", 1.6)
estudiante()
