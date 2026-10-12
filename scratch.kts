// ==========================================
// PUNTO 1: Sintaxis básica, Variables y Tipos
// ==========================================
println("=== PUNTO 1: Ficha del Paciente ===")

val nombrePaciente: String = "Thor"
var edadPaciente: Int = 3
var pesoPaciente: Float = 14.5f
val sexoPaciente: Char = 'M'
val estaVacunado: Boolean = true

// Simulación de cumpleaños y aumento de peso
edadPaciente += 1
pesoPaciente += 1.2f

// Impresión en una sola línea utilizando interpolación de cadenas ($)
println("Ficha Médica: Paciente $nombrePaciente | Edad: $edadPaciente años | Peso: $pesoPaciente kg | Sexo: $sexoPaciente | Vacunado: $estaVacunado")


// ==========================================
// PUNTO 2: Estructuras de Control (when e if)
// ==========================================
println("\n=== PUNTO 2: Clasificación y Prioridad ===")

val edadEvaluacion: Int = 9
val esUrgencia: Boolean = false

// Clasificación con estructura when
val categoria: String = when (edadEvaluacion) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..Int.MAX_VALUE -> "Senior"
    else -> "Edad no válida"
}

println("Categoría del paciente: $categoria")

// Evaluación de prioridad con if y operadores lógicos
if (esUrgencia || categoria == "Senior") {
    println("Atención: Prioridad Alta")
} else {
    println("Atención: Atención Regular")
}


// ==========================================
// PUNTO 3: Colecciones, Bucles y Rangos
// ==========================================
println("\n=== PUNTO 3: Sala de Espera y Rangos ===")

val mascotasEnEspera: List<String> = listOf("Luna", "Max", "Rocky", "Bella")

// Recorrido de la lista con asignación de turno
println("--- Listado de Turnos ---")
for ((index, mascota) in mascotasEnEspera.withIndex()) {
    println("Turno ${index + 1}: $mascota")
}

// Cuenta regresiva usando rangos inclusivos (downTo)
println("\nMinutos restantes para apertura:")
for (minuto in 5 downTo 1) {
    println("Abriendo clínica en $minuto min...")
}


// ==========================================
// PUNTO 4: Nulabilidad y Operador Elvis
// ==========================================
println("\n=== PUNTO 4: Manejo de Nulables ===")

val contactoEmergencia: String? = null

// Llamada segura
val longitudContacto: Int? = contactoEmergencia?.length
println("Longitud detectada mediante llamada segura: $longitudContacto")

// Asignación de valor por defecto con Operador Elvis (?:)
val contactoFinal: String = contactoEmergencia ?: "Sin contacto registrado"
println("Contacto asignado: $contactoFinal")


// ==========================================
// PUNTO 5: Lambdas y Operaciones en Colecciones
// ==========================================
println("\n=== PUNTO 5: Lambdas y Tarifas Nocturnas ===")

val preciosServicios: List<Double> = listOf(35000.0, 25000.0, 18000.0)

// Expresión lambda para calcular el recargo del 10%
val calcularTarifaNocturna: (Double) -> Double = { precio -> precio * 1.10 }

// Recorrido con .forEach utilizando el parámetro implícito 'it'
preciosServicios.forEach {
    val precioFinal = calcularTarifaNocturna(it)
    println("Servicio Base: $$it | Con recargo nocturno (10%): $$precioFinal")
}