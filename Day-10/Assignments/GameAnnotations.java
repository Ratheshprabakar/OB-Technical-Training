/**
 * 
 */
package com.onebill.training.day10.assignments;

import java.lang.annotation.Retention;
import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Rathesh Prabakar
 *
 */
public class GameAnnotations {

	/**
	 * @param args
	 */
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Games{
		GameTypeUsingBalls[]  value() default{};
	}
    
	//repeating annotation
	@GameTypeUsingBalls("Cricket")
	@GameTypeUsingBalls("Football")
	@GameTypeUsingBalls("Baseball")
	@GameTypeUsingBalls("Throw ball")
	public @interface Game{
		String value();
	}
	
	//Declaring repeatable annotation type
	
	@Repeatable(value=Games.class)
	public @interface GameTypeUsingBalls{
		String value();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameTypeUsingBalls[] game = Game.class.getAnnotationsByType(GameTypeUsingBalls.class);
		Games gt = Game.class.getAnnotation(Games.class);
		
		for(GameTypeUsingBalls gmt : gt.value()) {
			System.out.println(gmt.value());
		}

	}

}
