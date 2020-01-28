package model.data_structures;

import com.sun.corba.se.impl.orbutil.concurrent.ReentrantMutex;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T extends Comparable<T>> implements IArregloDinamico {
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = (T[])new Comparable[max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( T dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    T [ ] copia = elementos;
                    elementos = (T[])new Comparable[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		public T darElemento(T  i) {
			// TODO implementar
			if((int)i <=tamanoAct)
				{
				return elementos[(int )i];
				}
			else
			{
				return null;
			}
				
		}

		public T buscar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			T x = null;
			for (int i = 0; i < tamanoAct; i++) {
				T actual = elementos[i];
				if(dato.compareTo(actual)== 0)
				{
				   x = actual;
				}
				else
				{
					return null;
				}
				
			}
			return x;
		}

		public T eliminar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			
			T eliminado = null;
			for (int i = 0; i < elementos.length; i++) 
			{
				T actual = elementos[i];
				if(actual.compareTo(dato)== 0)
				{
					eliminado = actual;
					actual = elementos[i+1];
					tamanoAct --;
				}
				
			}
			return eliminado;
		}

		@Override
		public String darElemento(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void agregar(String dato) {
			// TODO Auto-generated method stub
			
		}

		
		public String eliminar(String dato) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T buscar(T dato) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T eliminar(T dato) {
			// TODO Auto-generated method stub
			return null;
		}

}
