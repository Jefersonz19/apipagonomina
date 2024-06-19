# apipagonomina   Elaborado por: Jeferson Zapata

# Esta API provee la funcionalidad de indicar la fecha en la que se debe pagar la nómina de los empleados; enfocando su utilidad para el área de nómina de Konecta. Se sabe que normalmente la nómina se paga los días 15 y 30 del mes, sin embargo hay algunas excepciones cuando la fecha coincide con un día no hábil o feriado.

# La API recibe una fecha del cliente via REST y luego procede con la validación o cálculos, determinando si la fecha recibida es día no hábil (Sábado o Domingo) o si es una fecha festiva, en tal caso retorna la fecha de pago como el día hábil inmediatamente anterior.

# Todo el desarrollo Core de los cálculos y sintaxis fue desarrollada con Java y se usó el framework Java SpringBoot para la elaboración de la API ya que este marco provee muchas funcionalidades potentes y eficaces que agilizan el proceso de creación de un API, entre ellos el Patrón MVC, OOP, Inyección de Dependencias usando JPA Repository y la modularidad enfocada en los microservicios muy útil en las aplicaciones con características Enterprise, basadas en servicios web (REST y SOAP).

# Es necesario tener configurada una base de datos llamada festivos, se dejan las instrucciones SQL DDL y DML para el montaje, luego de creada la API puede hacer la consulta a la base para realizar el cálculo y retornar la fecha indicada.




