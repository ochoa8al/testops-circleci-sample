import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setViewPortSize(400, 800)

WebUI.executeJavaScript(Script_Mashup_GT, null)

WebUI.delay(3)

'Pantalla de parámetros: CIF BCO'
WebUI.click(findTestObject('GT_DigitalAccount/input_CIFBCO_PpyWorkPagepSelectedBCORecordpCIF'))

'Pantalla de parámetros: CIFCOM'
WebUI.click(findTestObject('GT_DigitalAccount/input_CIFCOM_PpyWorkPagepSelectedCOMRecordpCIF'))

'Pantalla de parámetros: '
WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar'))

WebUI.delay(3)

'Pantalla de Bienvenida '
WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar'))

WebUI.delay(3)

'Pantalla de Bienvenida '
WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar_1'))

WebUI.delay(3)

'Datos Personales: Primer Nombre'
WebUI.click(findTestObject('GT_DigitalAccount/input_Primer nombre_PpyWorkPageppyWorkParty_97c324'), FailureHandling.STOP_ON_FAILURE)

'Datos Personales: Segundo Nombre'
WebUI.click(findTestObject('GT_DigitalAccount/input_Segundo nombre (opcional)_PpyWorkPage_2b3525'), FailureHandling.STOP_ON_FAILURE)

'Datos Personales: Primer Apellido'
WebUI.click(findTestObject('GT_DigitalAccount/input_Primer apellido_PpyWorkPageppyWorkPar_9e8044'), FailureHandling.STOP_ON_FAILURE)

'Datos Personales: Segundo Apellido'
WebUI.click(findTestObject('GT_DigitalAccount/input_Segundo apellido_PpyWorkPageppyWorkPa_a0b719'), FailureHandling.STOP_ON_FAILURE)

'Datos Personales: Fecha de Nacimiento (ReadOnly)'
WebUI.click(findTestObject('GT_DigitalAccount/span_Fecha de nacimiento_PpyWorkPageppyWork_4ce5b6'))

'Datos Personales: Departamento de Nacimiento'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038'))

WebUI.delay(5)

'Datos Personales: Departamento de Nacimiento'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038'), 'ALTA VERAPAZ', FailureHandling.STOP_ON_FAILURE)

'Datos Personales: Departamento de Nacimiento'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038'), 0, 0)

WebUI.delay(4)

'Datos Personales: Municipio de Nacimiento'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7'))

WebUI.delay(5)

'Datos Personales: Municipio de Nacimiento'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7'), 'COBAN', FailureHandling.STOP_ON_FAILURE)

'Datos Personales: Municipio de Nacimiento'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7'), 0, 0)

WebUI.delay(4)

'Datos Personales: Género:Hombre'
WebUI.click(findTestObject('GT_DigitalAccount/label_Hombre'))

'Datos Personales: Género:Femenino'
WebUI.click(findTestObject('GT_DigitalAccount/label_Femenino'))

'Datos Personales: Otra Nacionalidad: NO'
WebUI.click(findTestObject('GT_DigitalAccount/label_No'))

'Datos Personales: Otra Nacionalidad: SI'
WebUI.click(findTestObject('GT_DigitalAccount/label_S'))

'Datos Personales: '
WebUI.click(findTestObject('GT_DigitalAccount/i_Otra nacionalidad_pi pi-caret-down'))

WebUI.delay(5)

'Datos Personales: '
WebUI.setText(findTestObject('GT_DigitalAccount/input_Otra nacionalidad_PpyWorkPageppyWorkP_8ec912'), 'Panama')

WebUI.delay(2)

'Datos Personales: '
WebUI.click(findTestObject('GT_DigitalAccount/span_Panama'))

WebUI.delay(2)

'Datos Personales: Estado Civil: Soltero'
WebUI.click(findTestObject('GT_DigitalAccount/select_CASADOCOHABITANDOUNION LIBREDIVORCIA_789ac9'))

WebUI.delay(2)

'Datos Personales: Estado Civil: Soltero'
WebUI.selectOptionByValue(findTestObject('GT_DigitalAccount/select_CASADOCOHABITANDOUNION LIBREDIVORCIA_789ac9'), 'SOLTERO', 
    true)

'Datos Personales: Relación con figura política: SI'
WebUI.click(findTestObject('GT_DigitalAccount/label_S'))

'Datos Personales: Relación con figura política: NO'
WebUI.click(findTestObject('GT_DigitalAccount/label_No'))

'Datos Personales: Relación con figura política: NO'
WebUI.scrollToElement(findTestObject('GT_DigitalAccount/label_No'), 0)

'Datos Personales: '
WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar_1'))

WebUI.delay(5)

'Datos de Identificación: Número de Identificación'
WebUI.click(findTestObject('GT_DigitalAccount/span_Nmero de identificacin_bac_mobile'))

'Datos de Identificación: Fecha de vencimiento identificación'
WebUI.click(findTestObject('GT_DigitalAccount/span_Fecha de vencimiento de identificacin__f3f30c'))

'Datos de Identificación: Departamento de emisión de identificación'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1'))

WebUI.delay(5)

'Datos de Identificación: Departamento de emisión de identificación'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1'), 'BAJA VERAPAZ', 
    FailureHandling.STOP_ON_FAILURE)

'Datos de Identificación: Departamento de emisión de identificación'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1'), 0, 0)

WebUI.delay(2)

'Datos de Identificación: Municipio de emisión de identificación'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinSALAMASAN MIGUEL_993633'))

WebUI.delay(5)

'Datos de Identificación: Municipio de emisión de identificación'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinSALAMASAN MIGUEL_993633'), 'SALAMA', FailureHandling.STOP_ON_FAILURE)

'Datos de Identificación: Municipio de emisión de identificación'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinSALAMASAN MIGUEL_993633'), 0, 0)

WebUI.delay(2)

'Datos de Identificación: Tel. Celular'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Telfono celular_PpyWorkPageppyWorkPar_132f29'), '39857421')

WebUI.delay(2)

'Datos de Identificación: Tel. Trabajo'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Telfono del trabajo_PpyWorkPageppyWor_c525e3'), '39879889')

WebUI.delay(2)

'Datos de Identificación: Correo'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Correo electrnico_PpyWorkPageppyWorkP_92a85c'), 'katalontest@gmail.com')

'Datos de Identificación: '
WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar_1'))

WebUI.delay(5)

'Datos de residencia: Departamento de residencia'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1_2'))

WebUI.delay(5)

'Datos de residencia: Departamento de residencia'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1_2'), 'ALTA VERAPAZ', 
    FailureHandling.STOP_ON_FAILURE)

'Datos de residencia: Departamento de residencia'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1_2'), 0, 0)

WebUI.delay(2)

'Datos de residencia: Municipio de residencia'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7_1_2'))

WebUI.delay(5)

'Datos de residencia: Municipio de residencia'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7_1_2'), 'COBAN', FailureHandling.STOP_ON_FAILURE)

'Datos de residencia: Municipio de residencia'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7_1_2'), 0, 0)

WebUI.delay(2)

'Datos de residencia: Dirección de residencia'
WebUI.setText(findTestObject('GT_DigitalAccount/textarea_Direccin de residencia_PpyWorkPage_761eb1'), 'Prueba dirección de residencia, bac credomatic, prueba de automatización de pruebas con ka')

WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar_1'))

WebUI.delay(5)

'Datos Laborales: Ocupación'
WebUI.click(findTestObject('GT_DigitalAccount/i_Ocupacin u oficio_pi pi-caret-down'))

WebUI.delay(2)

'Datos Laborales: Valor de Ocupación'
WebUI.click(findTestObject('GT_DigitalAccount/span_ABOGADO'))

WebUI.delay(2)

'Datos Laborales: Nivel de escolaridad'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinANALFABETOBACHIL_dc8c02'))

WebUI.delay(2)

'Datos Laborales: Nivel de escolaridad'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinANALFABETOBACHIL_dc8c02'), 'BACHILLER', FailureHandling.STOP_ON_FAILURE)

'Datos Laborales: Nivel de escolaridad'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinANALFABETOBACHIL_dc8c02'), 0, 0)

WebUI.delay(1)

'Datos Laborales: PEP/CPE (SI)'
WebUI.check(findTestObject('GT_DigitalAccount/PEP_CPE/label_S'))

'Datos Laborales: PEP/CPE (NO)'
WebUI.check(findTestObject('GT_DigitalAccount/PEP_CPE/label_No'))

'Datos Laborales: Fuente de Ingresos'
WebUI.click(findTestObject('GT_DigitalAccount/select_ASALARIADONEGOCIO PROPIOOTRAS FUENTE_b50adc'))

WebUI.delay(2)

'Datos Laborales: Fuente de Ingresos'
WebUI.selectOptionByValue(findTestObject('GT_DigitalAccount/select_ASALARIADONEGOCIO PROPIOOTRAS FUENTE_b50adc'), 'ASALARIADO', 
    true)

WebUI.delay(1)

'Datos Laborales: Sector(Público)'
WebUI.click(findTestObject('GT_DigitalAccount/label_Pblico'))

'Datos Laborales: Sector(Privado)'
WebUI.click(findTestObject('GT_DigitalAccount/label_Privado'))

'Datos Laborales: Ingreso mensual'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Ingreso mensual (sin deducciones)_Ppy_1eeba8'), '3687')

'Datos Laborales: Nombre de la empresa'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Nombre de la empresa_PpyWorkPageppyWo_91a371'), 'TestNombreEmpresa')

'Datos Laborales: Actividad económica de la empresa'
WebUI.click(findTestObject('GT_DigitalAccount/i_Actividad econmica de la empresa_pi pi-ca_183de0'))

WebUI.delay(2)

'Datos Laborales: Actividad económica de la empresa (Valor)'
WebUI.click(findTestObject('GT_DigitalAccount/span_AMA DE CASA'))

WebUI.delay(2)

'Datos Laborales: Fecha de ingreso en la empresa'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Fecha de ingreso en esa empresa_PpyWo_64efa9'), '02/02/2015')

'Datos Laborales: Teléfono de la empresa'
WebUI.click(findTestObject('GT_DigitalAccount/input_Telfono del trabajo_PpyWorkPageppyWor_c525e3'), FailureHandling.STOP_ON_FAILURE)

'Datos Laborales: Teléfono de la empresa'
WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

'Datos Laborales: Teléfono de la empresa'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Telfono del trabajo_PpyWorkPageppyWor_c525e3'), '')

'Datos Laborales: Teléfono de la empresa'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/input_Telfono del trabajo_PpyWorkPageppyWor_c525e3'), '39857452')

WebUI.delay(2)

'Datos Laborales: Departamento de la empresa'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1_2_3'))

WebUI.delay(3)

'Datos Laborales: Departamento de la empresa'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1_2_3'), 'ALTA VERAPAZ', 
    FailureHandling.STOP_ON_FAILURE)

'Datos Laborales: Departamento de la empresa'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinALTA VERAPAZBAJA_985038_1_2_3'), 0, 0)

WebUI.delay(2)

'Datos Laborales: Municipio de la empresa'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7_1_2_3'))

WebUI.delay(3)

'Datos Laborales: Municipio de la empresa'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7_1_2_3'), 'COBAN', FailureHandling.STOP_ON_FAILURE)

'Datos Laborales: Municipio de la empresa'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/select_Seleccione una opcinCOBANSAN JUAN CH_7f38f7_1_2_3'), 0, 0)

WebUI.delay(2)

'Datos Laborales: Dirección de la empresa'
WebUI.setText(findTestObject('GT_DigitalAccount/textarea_Direccin de la empresa_PpyWorkPage_1efea1'), 'dirección de la empresa.')

'Datos Laborales: Desea agregar otros ingresos'
WebUI.click(findTestObject('GT_DigitalAccount/Otros_Ingresos/div_Desea agregar otros ingresos'))

'Datos Laborales: Desea agregar otros ingresos'
WebUI.scrollToElement(findTestObject('GT_DigitalAccount/Otros_Ingresos/div_Desea agregar otros ingresos'), 0)

'Datos Laborales: Desea agregar otros ingresos (NO)'
WebUI.click(findTestObject('GT_DigitalAccount/Otros_Ingresos/label_No'))

'Datos Laborales: Desea agregar otros ingresos (SI)'
WebUI.click(findTestObject('GT_DigitalAccount/Otros_Ingresos/label_S'))

WebUI.delay(2)

'Datos Laborales: Fuente de otros ingresos'
WebUI.click(findTestObject('GT_DigitalAccount/select_Seleccione una opcinAct. Prof. Aboga_91f2fb'))

WebUI.delay(2)

'Datos Laborales: Fuente de otros ingresos'
WebUI.selectOptionByValue(findTestObject('GT_DigitalAccount/select_Seleccione una opcinAct. Prof. Aboga_91f2fb'), '15', 
    true)

WebUI.delay(2)

'Datos Laborales: Moneda Otros Ingresos(QTZ)'
WebUI.click(findTestObject('GT_DigitalAccount/label_Quetzales'))

'Datos Laborales: Moneda Otros Ingresos(USD)'
WebUI.click(findTestObject('GT_DigitalAccount/label_Dlares'))

WebUI.delay(3)

'Datos Laborales: Ingreso mensual otros ingresos'
WebUI.setText(findTestObject('GT_DigitalAccount/input_Ingreso mensual (sin deducciones)_Ppy_ae30c0'), '1589')

WebUI.click(findTestObject('GT_DigitalAccount/button_Continuar_1'))

WebUI.delay(5)

'Datos de la cuenta:'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/div_Datos de la cuenta'))

'Datos de la cuenta: Moneda(USD)'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/label_Dlares'))

'Datos de la cuenta: Moneda(QTZ)'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/label_Quetzales'))

'Datos de la cuenta: '
WebUI.delay(2)

'Datos de la cuenta: Rango (0.01 a 1000)'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/select_Seleccione una opcin0.01'), '0.01 a 1000')

'Datos de la cuenta: '
WebUI.delay(2)

'Datos de la cuenta: '
WebUI.clickOffset(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/select_Seleccione una opcin0.01'), 0, 0)

WebUI.delay(2)

'Datos de la cuenta: Verificando si trajo datos la DTable'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/div_1000'))

WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/button_Continuar'))

WebUI.delay(5)

'Beneficiario: Nombre Completo'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/input_Nombre completo del beneficiario'), 'Carlos Fernando Peres')

WebUI.delay(2)

'Beneficiario: Tipo Identificación (DPI)'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/select_Seleccione una opcionDPI'), 'DPI')

'Beneficiario: Tipo Identificación (DPI)'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/select_Seleccione una opcionDPI'), 0, 0)

WebUI.delay(4)

'Beneficiario: Número de identificación DPI Guatemala'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/input_Nmero de identificacin'))

'Beneficiario: Número de identificación DPI Guatemala'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/input_Nmero de identificacin'), '5252 87878 5051', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Beneficiario: Número de identificación DPI Guatemala'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/button_Continuar'))

WebUI.delay(2)

'Tarjeta: Marca'
WebUI.click(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/select_Seleccione MasterCard'))

WebUI.delay(2)

'Tarjeta: Marca (MasterCard)'
WebUI.sendKeys(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/select_Seleccione MasterCard'), 'MasterCard')

'Tarjeta: Marca (MasterCard)'
WebUI.clickOffset(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/select_Seleccione MasterCard'), 0, 0)

WebUI.delay(2)

'Tarjeta: Dirección entrega'
WebUI.click(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/label_Residencia'))

WebUI.delay(2)

'Terminos y condiciones'
WebUI.click(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/input_checked'))

WebUI.delay(2)

'Terminos y condiciones: Fatca'
WebUI.scrollToElement(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/input_Acepto los_IsFatcaTermsChecked'), 
    0)

'Terminos y condiciones: Fatca'
WebUI.click(findTestObject('GT_DigitalAccount/TerminosCondiciones_Tarjeta/input_Acepto los_IsFatcaTermsChecked'))

WebUI.delay(2)

'Beneficiario: Número de identificación DPI Guatemala'
WebUI.click(findTestObject('GT_DigitalAccount/DatosCuenta_Beneficiario/button_Continuar'))

WebUI.delay(5)

WebUI.closeBrowser()

