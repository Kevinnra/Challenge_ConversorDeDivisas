# 💱 Convertidor de Monedas: ¡Tu Aliado Global! 🌎

¡Bienvenido al **Convertidor de Monedas**! 🎉 Este es un proyecto simple pero poderoso que te permite convertir entre **dólares estadounidenses** y tres monedas latinoamericanas populares: **peso argentino**, **real brasileño**, y **peso colombiano**. 🌟

---

## 💡 **¿Qué Hace Este Proyecto?**
Este programa:
- Obtiene tasas de cambio actualizadas de la API [ExchangeRate](https://www.exchangerate-api.com). 🔧
- Proporciona un menú interactivo para seleccionar la conversión que necesitas. 🔄
- Realiza cálculos rápidos para convertir montos entre las monedas disponibles. ✅

---

## 🔄 **Opciones del Menú**
1. **Dólar → Peso Argentino** 💵
2. **Peso Argentino → Dólar** 💵
3. **Dólar → Real Brasileño** 🤑
4. **Real Brasileño → Dólar** 🤑
5. **Dólar → Peso Colombiano** 💴
6. **Peso Colombiano → Dólar** 💴
7. **Salir del Programa** 🚶‍♂️

---

## 🛠️ **Tecnologías Utilizadas**
- **Java** ☕: Lenguaje de programación principal.
- **HttpClient** ⚙: Para hacer solicitudes HTTP a la API.
- **Gson** 🤖: Para procesar datos JSON de las respuestas de la API.
- **API de ExchangeRate** 🔄: Fuente de tasas de cambio actualizadas.

---

## 🔧 **Configuración y Ejecución**

### ⚡ Pasos Rápidos:

1. **Reemplaza tu clave API:**  
   En el archivo `ExchangeRateService.java`, actualiza la constante `API_URL` con tu clave API de [ExchangeRate](https://www.exchangerate-api.com):
   ```java
   private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD";
   ```

2. **Compila el proyecto:**  
   Usa tu IDE favorito (como IntelliJ IDEA o Eclipse) o desde la línea de comandos:
   ```bash
   javac -d bin src/com/currencyconverter/**/*.java
   ```

3. **Ejecuta la aplicación:**  
   ```bash
   java -cp bin com.currencyconverter.Main
   ```

---

## 🔁 **Cómo Interactuar**
1. Selecciona una opción del menú escribiendo el número correspondiente.
2. Ingresa la cantidad de dinero que deseas convertir.
3. Mira la magia 🎩: el programa calculará y te mostrará el resultado.
4. Repite el proceso o selecciona "7" para salir. 👋

---

## 🚀 **Contribuciones**
¡Este proyecto está abierto a contribuciones! 🌐
1. Haz un fork del repositorio. 🛠️
2. Crea una rama: `git checkout -b mi-mejora`. 🌱
3. Envía un pull request con tus cambios. 📦

---

## 🔒 **Licencia**
Este proyecto está bajo la licencia MIT. 📚 Siéntete libre de usarlo, mejorarlo y compartirlo. 🌟

---

¡Gracias por usar el convertidor de monedas! 🌎✨ Dale una estrella en GitHub si te gusta este proyecto. 🌟⭐

