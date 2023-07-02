# Temperature-Converter
Temperature Converter (Fahrenheit to Celsius and vise versa) application built on JavaFX. Also there is folder: "AFmaven-project-Test" which is the implementation of the same project with Maven building tool.

The main view of the app frame as following, which has the window for taking input temperature, and two buttons for Fahrenheit to Celsius and Celsius to Fahrenheit, and lastly output window. Project was built on the basis of MVC pattern (Model View Controller):

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/225517891-24fedf46-745a-41bd-b10d-2516101ea3c6.png" alt="Image">
</p>

This is the example screenshot when entering input temperature and press the button 'Fahrenheit to Celsius' to make conversion, then get the result on the output window:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/225518147-7a1fe565-59f5-45ef-a50c-7065873c2a0d.png" alt="Image">
</p>

Last example showing the conversion from Celsius to Fahrenheit:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/225518242-aa719a1f-ed88-4d47-8c7e-a7145b7b8080.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/Temperature-Converter/tree/main/TemperatureConverter)

- The code follows the `Model-View-Controller` (MVC) design pattern, where the model (Model) handles the data and calculations, the view (UI) presents the user interface, and the controller (Controller) manages the interactions between the model and the view.
- When the user enters a temperature and clicks on the corresponding conversion button, the controller updates the model and the UI, ensuring a separation of concerns and a clean code structure.
- `Controller class`:
  - This class acts as a controller that handles the interaction between the UI (`objUI`) and the data model (`objModel`).
  - It implements two event listeners, `FtoCListener` and `CtoFListener`, which are responsible for performing temperature conversions and updating the UI accordingly.
  - In the FtoCListener and CtoFListener classes, the `actionPerformed` method is triggered when the corresponding conversion button is clicked.
  - Inside the actionPerformed method, the input temperature (`inputTf`) is retrieved from the UI using `objUI.getInputTf()`.
  - The model's conversion methods (FtoC_Calculation and CtoF_Calculation) are called with the input temperature, and the calculated values are stored in the model.
  - The updated temperature values are then set in the UI using `objUI.setOutputTf()`.
- `Main class`:
  - This class serves as the entry point of the program.
  - It creates instances of the UI (`objUI`), model (`objModel`), and controller (`objControl`).
  - The UI is made visible by calling `objUI.setVisible(true)`.
- `Model class`:
  - This class represents the data model for the temperature converter.
  - It has two instance variables, `FtoCvalue` and `CtoFvalue`, to store the calculated temperature values.
  - The `FtoC_Calculation` method performs the Fahrenheit to Celsius conversion using the input temperature and stores the result in FtoCvalue.
  - The `getFtoC_Calculation` method returns the stored Celsius value.
  - The `CtoF_Calculation` method performs the Celsius to Fahrenheit conversion using the input temperature and stores the result in CtoFvalue.
  - The `getCtoF_Calculation` method returns the stored Fahrenheit value.
