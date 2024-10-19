package com.mathematical_reasoning.raz_mat;

import android.content.Context;
import com.mathematical_reasoning.raz_mat.models.Problema;
import com.mathematical_reasoning.raz_mat.utils.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ProblemSucesionesSeriesFactory {

    public static Problema createProblemSucesionesSeries(Context context, int dificultad) {
        Random random = new Random();
        int tipo;

        // Determinar el tipo de problema basado en la dificultad
        switch (dificultad) {
            case 1:
                tipo = random.nextInt(2) + 1;
                break;
            case 2:
                tipo = random.nextInt(2) + 3;
                break;
            default:
                tipo = random.nextInt(2) + 5;
                break;
        }

        Problema problema;
        String enunciado;
        String solucion;
        String precalculo;
        String tip;
        // Crear problema basado en el tipo generado
        switch (tipo) {
            case 1:
                enunciado = FileUtils.getTextFromRaw(context, R.raw.sucesiones_enunciado);
                precalculo = FileUtils.getTextFromRaw(context, R.raw.precalculate_sucesiones_nth1);
                solucion = FileUtils.getTextFromRaw(context, R.raw.solucion_sucesiones_nth1);
                tip = FileUtils.getTextFromRaw(context, R.raw.tip_sucesiones_nth1);
                problema = createProblemSucesionesNth1(enunciado, precalculo, solucion, dificultad, tip);
                break;
            case 2:
                enunciado = FileUtils.getTextFromRaw(context, R.raw.series_enunciado);
                precalculo = FileUtils.getTextFromRaw(context, R.raw.precalculate_series_nth1);
                solucion = FileUtils.getTextFromRaw(context, R.raw.solucion_series_nth1);
                tip = FileUtils.getTextFromRaw(context, R.raw.tip_series_nth1);
                problema = createProblemSeriesNth1(enunciado, precalculo, solucion, dificultad, tip);
                break;
            case 3:
                enunciado = FileUtils.getTextFromRaw(context, R.raw.sucesiones_enunciado);
                precalculo = FileUtils.getTextFromRaw(context, R.raw.precalculate_sucesiones_nth2);
                solucion = FileUtils.getTextFromRaw(context, R.raw.solucion_sucesiones_nth2);
                tip = FileUtils.getTextFromRaw(context, R.raw.tip_sucesiones_nth2);
                problema = createProblemSucesionesNth2(enunciado, precalculo, solucion, dificultad, tip);
                break;
            case 4:
                enunciado = FileUtils.getTextFromRaw(context, R.raw.series_enunciado);
                precalculo = FileUtils.getTextFromRaw(context, R.raw.precalculate_series_nth2);
                solucion = FileUtils.getTextFromRaw(context, R.raw.solucion_series_nth2);
                tip = FileUtils.getTextFromRaw(context, R.raw.tip_series_nth2);
                problema = createProblemSeriesNth2(enunciado, precalculo, solucion, dificultad, tip);
                break;
            case 5:
                enunciado = FileUtils.getTextFromRaw(context, R.raw.sucesiones_enunciado);
                precalculo = FileUtils.getTextFromRaw(context, R.raw.precalculate_sucesiones_nth3);
                solucion = FileUtils.getTextFromRaw(context, R.raw.solucion_sucesiones_nth3);
                tip = FileUtils.getTextFromRaw(context, R.raw.tip_sucesiones_nth3);
                problema = createProblemSucesionesNth3(enunciado, precalculo, solucion, dificultad, tip);
                break;
            default:
                enunciado = FileUtils.getTextFromRaw(context, R.raw.series_enunciado);
                precalculo = FileUtils.getTextFromRaw(context, R.raw.precalculate_series_nth3);
                solucion = FileUtils.getTextFromRaw(context, R.raw.solucion_series_nth3);
                tip = FileUtils.getTextFromRaw(context, R.raw.tip_series_nth3);
                problema = createProblemSeriesNth3(enunciado, precalculo, solucion, dificultad, tip);
                break;
        }
        return problema;
    }

    // Métodos para crear problemas de series de primer grado (término n-ésimo y suma)
    public static Problema createProblemSucesionesNth1(String enunciado, String precalculo, String solucion, int dificultad, String tip) {
        Random random = new Random();
        int a = random.nextInt(5) + 1;
        int r = random.nextInt(5) + 2;
        int n = dificultad * 4 + random.nextInt(5);
        int an = a + (n - 1) * r;
        String sucesion = a + ", " + (a + r) + ", " + (a + 2 * r) + ", ...";
        enunciado = getStatementSucesiones(enunciado, n, sucesion);
        precalculo = getPrecalculateSucesionNth1(precalculo, a, r, n);
        solucion = getSolutionSucesionNth1(solucion, sucesion, a, r, n, an);
        List<String> alternativas = getAlternatives(Integer.toString(an));
        int clave = alternativas.indexOf(Integer.toString(an));
        return new Problema(enunciado, alternativas, clave, precalculo, solucion, tip);
    }

    public static Problema createProblemSeriesNth1(String enunciado, String precalculo, String solucion, int dificultad, String tip) {
        Random random = new Random();
        int a = random.nextInt(5) + 1;
        int r = random.nextInt(5) + 2;
        int n = dificultad * 4 + random.nextInt(5);
        int sn = a * n + (n - 1) * n * r / 2;
        String sucesion = a + ", " + (a + r) + ", " + (a + 2 * r) + ", ...";
        enunciado = getStatementSeries(enunciado, n, sucesion);
        precalculo = getPrecalculateSerieNth1(precalculo, a, r, n);
        solucion = getSolutionSerieNth1(solucion, sucesion, a, r, n, sn);
        List<String> alternativas = getAlternatives(Integer.toString(sn));
        int clave = alternativas.indexOf(Integer.toString(sn));
        return new Problema(enunciado, alternativas, clave, precalculo, solucion, tip);
    }

    // Métodos para crear problemas de series de segundo grado (término n-ésimo y suma)
    public static Problema createProblemSucesionesNth2(String enunciado, String precalculo, String solucion, int dificultad, String tip) {
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        int r1 = random.nextInt(6) + 2;
        int r2 = random.nextInt(4) + 1;
        int n = dificultad * 5 + random.nextInt(5);
        int an = a + (n - 1) * r1 + (n - 1) * (n - 2) * r2 / 2;
        String sucesion = a + ", " + (a + r1) + ", " + (a + 2 * r1 + r2) + ", " + (a + 3 * r1 + 3 * r2) + ", ...";
        enunciado = getStatementSucesiones(enunciado, n, sucesion);
        precalculo = getPrecalculateSucesionNth2(precalculo, a, r1, r2, n);
        solucion = getSolutionSucesionNth2(solucion, sucesion, a, r1, r2, n, an);
        List<String> alternativas = getAlternatives(Integer.toString(an));
        int clave = alternativas.indexOf(Integer.toString(an));
        return new Problema(enunciado, alternativas, clave, precalculo, solucion, tip);
    }

    public static Problema createProblemSeriesNth2(String enunciado, String precalculo, String solucion, int dificultad, String tip) {
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        int r1 = random.nextInt(6) + 2;
        int r2 = random.nextInt(4) + 1;
        int n = dificultad * 5 + random.nextInt(5);
        int sn = a * n + (n - 1) * n * r1 / 2 + (n - 2) * (n - 1) * n * r2 / 6;
        String sucesion = a + ", " + (a + r1) + ", " + (a + 2 * r1 + r2) + ", " + (a + 3 * r1 + 3 * r2) + ", ...";
        enunciado = getStatementSeries(enunciado, n, sucesion);
        precalculo = getPrecalculateSerieNth2(precalculo, a, r1, r2, n);
        solucion = getSolutionSerieNth2(solucion, sucesion, a, r1, r2, n, sn);
        List<String> alternativas = getAlternatives(Integer.toString(sn));
        int clave = alternativas.indexOf(Integer.toString(sn));
        return new Problema(enunciado, alternativas, clave, precalculo, solucion, tip);
    }

    // Métodos para crear problemas de series de tercer grado (término n-ésimo y suma)
    public static Problema createProblemSucesionesNth3(String enunciado, String precalculo, String solucion, int dificultad, String tip) {
        Random random = new Random();
        int a = random.nextInt(7) + 1;
        int r1 = random.nextInt(6) + 2;
        int r2 = random.nextInt(4) + 2;
        int r3 = random.nextInt(3) + 1;
        int n = dificultad * 5 + random.nextInt(5);
        int an = a + (n - 1) * r1 + (n - 1) * (n - 2) * r2 / 2 + (n - 1) * (n - 2) * (n - 3) * r3 / 6;
        String sucesion = a + ", " + (a + r1) + ", " + (a + 2 * r1 + r2) + ", " + (a + 3 * r1 + 3 * r2 + r3) + ", ...";
        enunciado = getStatementSucesiones(enunciado, n, sucesion);
        precalculo = getPrecalculateSucesionNth3(precalculo, a, r1, r2, r3, n);
        solucion = getSolutionSucesionNth3(solucion, sucesion, a, r1, r2, r3, n, an);
        List<String> alternativas = getAlternatives(Integer.toString(an));
        int clave = alternativas.indexOf(Integer.toString(an));
        return new Problema(enunciado, alternativas, clave, precalculo, solucion, tip);
    }

    public static Problema createProblemSeriesNth3(String enunciado, String precalculo, String solucion, int dificultad, String tip) {
        Random random = new Random();
        int a = random.nextInt(7) + 1;
        int r1 = random.nextInt(6) + 2;
        int r2 = random.nextInt(4) + 2;
        int r3 = random.nextInt(3) + 1;
        int n = dificultad * 5 + random.nextInt(5);
        int sn = a * n + (n - 1) * n * r1 / 2 + (n - 2) * (n - 1) * n * r2 / 6 + (n - 3) * (n - 2) * (n - 1) * n * r3 / 24;
        String sucesion = a + ", " + (a + r1) + ", " + (a + 2 * r1 + r2) + ", " + (a + 3 * r1 + 3 * r2 + r3) + ", ...";
        enunciado = getStatementSeries(enunciado, n, sucesion);
        precalculo = getPrecalculateSerieNth3(precalculo, a, r1, r2, r3, n);
        solucion = getSolutionSerieNth3(solucion, sucesion, a, r1, r2, r3, n, sn);
        List<String> alternativas = getAlternatives(Integer.toString(sn));
        int clave = alternativas.indexOf(Integer.toString(sn));
        return new Problema(enunciado, alternativas, clave, precalculo, solucion, tip);
    }

    // Métodos auxiliares
    private static String getStatementSucesiones(String enunciado, int n, String sucesion) {
        return enunciado.replace("_n_", Integer.toString(n)).replace("_sucesion_", sucesion);
    }
    private static String getStatementSeries(String enunciado, int n, String sucesion) {
        return enunciado.replace("_n_", Integer.toString(n)).replace("_sucesion_", sucesion);
    }

    private static String getSolutionSucesionNth1(String solucion, String sucesion, int a, int r, int n, int an) {
        return solucion.replace("_sucesion_", sucesion)
                .replace("_a_", Integer.toString(a))
                .replace("_r_", Integer.toString(r))
                .replace("_n_", Integer.toString(n))
                .replace("_n-1_", Integer.toString(n-1))
                .replace("_(n-1)*r_", Integer.toString((n-1)*r))
                .replace("_an_", Integer.toString(an));
    }

    private static String getPrecalculateSucesionNth1(String precalculo, int a, int r, int n) {
        return precalculo.replace("_a_", Integer.toString(a))
                .replace("_r_", Integer.toString(r))
                .replace("_n_", Integer.toString(n));
    }

    private static String getSolutionSerieNth1(String solucion, String sucesion, int a, int r, int n, int sn) {
        return solucion.replace("_sucesion_", sucesion)
                .replace("_a_", Integer.toString(a))
                .replace("_r_", Integer.toString(r))
                .replace("_n_", Integer.toString(n))
                .replace("_n-1_", Integer.toString(n-1))
                .replace("_a*n_", Integer.toString(a*n))
                .replace("_[(n-1)*n*r]/2_", Integer.toString(((n-1)*n*r)/2))
                .replace("_sn_", Integer.toString(sn));
    }

    private static String getPrecalculateSerieNth1(String precalculo, int a, int r, int n) {
        return precalculo.replace("_a_", Integer.toString(a))
                .replace("_r_", Integer.toString(r))
                .replace("_n_", Integer.toString(n));
    }

    private static String getSolutionSucesionNth2(String solucion, String sucesion, int a, int r1, int r2, int n, int an) {
        return solucion.replace("_sucesion_", sucesion)
                .replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_n_", Integer.toString(n))
                .replace("_n-1_", Integer.toString(n-1))
                .replace("_n-2_", Integer.toString(n-2))
                .replace("_(n-1)*r1_", Integer.toString((n-1)*r1))
                .replace("_[(n-1)*(n-2)*r2]/2_", Integer.toString(((n-1)*(n-2)*r2)/2))
                .replace("_an_", Integer.toString(an));
    }

    private static String getPrecalculateSucesionNth2(String precalculo, int a, int r1, int r2, int n) {
        return precalculo.replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_n_", Integer.toString(n));
    }

    private static String getSolutionSerieNth2(String solucion, String sucesion, int a, int r1, int r2, int n, int sn) {
        return solucion.replace("_sucesion_", sucesion)
                .replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_n_", Integer.toString(n))
                .replace("_n-1_", Integer.toString(n-1))
                .replace("_n-2_", Integer.toString(n-2))
                .replace("_a*n_", Integer.toString(a*n))
                .replace("_[(n-1)*n*r1]/2_", Integer.toString(((n-1)*n*r1)/2))
                .replace("_[(n-2)*(n-1)*n*r2]/6_", Integer.toString(((n-2)*(n-1)*n*r2)/6))
                .replace("_sn_", Integer.toString(sn));
    }

    private static String getPrecalculateSerieNth2(String precalculo, int a, int r1, int r2, int n) {
        return precalculo.replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_n_", Integer.toString(n));
    }

    private static String getSolutionSucesionNth3(String solucion, String sucesion, int a, int r1, int r2, int r3, int n, int an) {
        return solucion.replace("_sucesion_", sucesion)
                .replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_r3_", Integer.toString(r3))
                .replace("_n_", Integer.toString(n))
                .replace("_n-1_", Integer.toString(n-1))
                .replace("_n-2_", Integer.toString(n-2))
                .replace("_n-3_", Integer.toString(n-3))
                .replace("_(n-1)*r1_", Integer.toString((n-1)*r1))
                .replace("_[(n-1)*(n-2)*r2]/2_", Integer.toString(((n-1)*(n-2)*r2)/2))
                .replace("_[(n-1)*(n-2)*(n-3)*r3]/6_", Integer.toString(((n-1)*(n-2)*(n-3)*r3)/6))
                .replace("_an_", Integer.toString(an));
    }

    private static String getPrecalculateSucesionNth3(String precalculo, int a, int r1, int r2, int r3, int n) {
        return precalculo.replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_r3_", Integer.toString(r3))
                .replace("_n_", Integer.toString(n));
    }

    private static String getSolutionSerieNth3(String solucion, String sucesion, int a, int r1, int r2, int r3, int n, int sn) {
        return solucion.replace("_sucesion_", sucesion)
                .replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_r3_", Integer.toString(r3))
                .replace("_n_", Integer.toString(n))
                .replace("_n-1_", Integer.toString(n-1))
                .replace("_n-2_", Integer.toString(n-2))
                .replace("_n-3_", Integer.toString(n-3))
                .replace("_a*n_", Integer.toString(a*n))
                .replace("_[(n-1)*n*r1]/2_", Integer.toString(((n-1)*n*r1)/2))
                .replace("_[(n-2)*(n-1)*n*r2]/6_", Integer.toString(((n-2)*(n-1)*n*r2)/6))
                .replace("_[(n-3)*(n-2)*(n-1)*n*r3]/24_", Integer.toString(((n-3)*(n-2)*(n-1)*n*r3)/24))
                .replace("_sn_", Integer.toString(sn));
    }

    private static String getPrecalculateSerieNth3(String precalculo, int a, int r1, int r2, int r3, int n) {
        return precalculo.replace("_a_", Integer.toString(a))
                .replace("_r1_", Integer.toString(r1))
                .replace("_r2_", Integer.toString(r2))
                .replace("_r3_", Integer.toString(r3))
                .replace("_n_", Integer.toString(n));
    }

    // Método para generar alternativas
    private static List<String> getAlternatives(String respuesta) {
        int rpta = Integer.parseInt(respuesta);
        Random random = new Random();
        List<String> alternativas = new ArrayList<>();
        alternativas.add(respuesta); // Agregar la respuesta correcta

        // Generar 3 alternativas incorrectas
        for (int i = 0; i < 3; i++) {
            int alternativa = random.nextInt(2) == 0
                    ? rpta + random.nextInt(5) + 1
                    : rpta - random.nextInt(3) - 1;

            // Asegurarse de que no se repita una alternativa ya generada
            while (alternativas.contains(Integer.toString(alternativa))) {
                alternativa = random.nextInt(2) == 0
                        ? rpta + random.nextInt(5) + 1
                        : rpta - random.nextInt(3) - 1;
            }
            alternativas.add(Integer.toString(alternativa));
        }

        // Mezclar las alternativas para que la respuesta correcta no esté siempre en la misma posición
        Collections.shuffle(alternativas);
        String[] letters = {"A", "B", "C", "D"};
        for(int i = 0; i<alternativas.size() ;i++){
            String.format("%s) %s", letters[i], alternativas.get(i));
        }
        return alternativas;
    }

}
