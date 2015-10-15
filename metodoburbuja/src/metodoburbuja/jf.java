package metodoburbuja;

public class jf {

    int order[] = new int[28];
    String doc[] = new String[28];

    {
        doc[0] = "1. Las Sagradas Escrituras  ";
        doc[1] = " 2. La Trinidad";
        doc[2] = " 3. Dios Padre";
        doc[3] = " 4. Dios Hijo";
        doc[4] = " 5. Dios Espíritu Santo";
        doc[5] = " 6. Dios es el Creador";
        doc[6] = " 7. La Naturaleza del Hombre";
        doc[7] = " 8. El Gran Conflicto";
        doc[8] = " 9. Vida, Muerte y Ressurrección de Cristo";
        doc[9] = " 10. La Experiencia de la Salvación";
        doc[10] = " 11. El crecimiento en Cristo";
        doc[11] = " 12. La Iglesia";
        doc[12] = " 13. El Remaneciente y su Misión";
        doc[13] = " 14. Unidad en el Cuerpo de Cristo";
        doc[14] = " 15. El Bautismo";
        doc[14] = " 16. La Cena del Señor";
        doc[16] = " 17. Dones y Ministerios Espirituales";
        doc[17] = " 18. El Don de Profecía";
        doc[18] = " 19. La Ley de Dios";
        doc[19] = " 20. El Sábado";
        doc[20] = " 21. Mayordomía";
        doc[21] = " 22. Conducta Cristiana";
        doc[22] = " 23. Matrimonio y Familia";
        doc[23] = " 24. El Ministerio de Cristo en el Santuario Celestial";
        doc[24] = " 25. La Segunda Venida de Cristo";
        doc[25] = " 26. Muerte y Resurrección";
        doc[26] = " 27. El Milenio y el Fin del Pecado";
        doc[27] = " 28. La Nueva Tierra";
    }



    {
    order[0]=1;
    order[1]= 2;
    order[2]= 3;
    order[3]= 4;
    order[4]= 5;
    order[5]= 6;
    order[6]= 7;
    order[7]=8;
    order[8]=9;
    order[9]=10;
    order[10]= 11;
    order[11]=12;
    order[12]=13;
    order[13]=14;
    order[14]=15;
    order[14]=16;
    order[16]=17;
    order[17]=18;
    order[18]=19;
    order[19]=20;
    order[20]=21;
    order[21]=22;
    order[22]=23;
    order[23]=24;
    order[24]=25;
    order[25]=26;
    order[26]=27;
    order[27]=28;
    }
    
 String ordenar(int i)
    {
        for (int j = 0; j < 27; j++) {
            for (int k = j+1; k < 28; k++) {
                
                if(order[j] > order[k])
                {
                    int numeros;
                    numeros = order[j];
                    order[j] = order[k];
                    order[k]= numeros;
                    
                    String doctrinas;
                    doctrinas=doc[j];
                    doc[j] = doc[k];
                    doc[k]= doctrinas;
                }
            }
        }
        return doc[i];
    }
    
    String desor(int i)
    {
        for (int j = 0; j < 27; j++) {
            for (int k = j+1; k < 28; k++) {
                if(order[j] < order[k])
                {
                    int numeros;
                    numeros = order[j];
                    order[j] = order[k];
                    order[k]= numeros;
                    
                    String doctrinas;
                    doctrinas = doc[j];
                    doc[j] = doc[k];
                    doc[k]= doctrinas;
                }
            }
        
            }
        
        return doc[i];
    }
}