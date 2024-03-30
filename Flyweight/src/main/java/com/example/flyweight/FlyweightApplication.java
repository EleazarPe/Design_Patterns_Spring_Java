package com.example.flyweight;

import ch.qos.logback.classic.pattern.LineSeparatorConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class FlyweightApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyweightApplication.class, args);


		Map<String, EnemyType> enemyTypes = new HashMap<>();
		List<Enemy> enemies = new ArrayList<>();

		enemyTypes.put("small", new EnemyType("MiniMan", "small", "azul",  1.5));
		enemyTypes.put("big", new EnemyType("MegaBoy", "big", "rojo",  5));

		enemies.add(new Enemy(0,0,100,enemyTypes.get("small")));
		enemies.add(new Enemy(0,2,100,enemyTypes.get("small")));
		enemies.add(new Enemy(0,4,100,enemyTypes.get("small")));
		enemies.add(new Enemy(0,6,100,enemyTypes.get("small")));
		enemies.add(new Enemy(0,8,100,enemyTypes.get("small")));
		enemies.add(new Enemy(10,0,500,enemyTypes.get("big")));
		enemies.add(new Enemy(0,10,500,enemyTypes.get("big")));
		enemies.add(new Enemy(0,10,500,enemyTypes.get("big")));



	}

}
