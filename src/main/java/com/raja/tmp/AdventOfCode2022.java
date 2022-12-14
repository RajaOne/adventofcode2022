package com.raja.tmp;

import com.raja.tmp.day24.Blizzard;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Path;

import static com.raja.tmp.day1.CaloricCounter.caloricCounter;
import static com.raja.tmp.day10.CathodeRay.cathodeRay;
import static com.raja.tmp.day11.MonkeyMiddle.monkeyMiddle;
import static com.raja.tmp.day12.HillClimb.hillClimb;
import static com.raja.tmp.day12.HillClimb.hillClimbAnyA;
import static com.raja.tmp.day13.Distress.distress;
import static com.raja.tmp.day14.Regolith.regolith;
import static com.raja.tmp.day14.Regolith.regolith2;
import static com.raja.tmp.day15.BeaconExclusion.beaconExclusion;
import static com.raja.tmp.day16.Volcanium.volcanium;
import static com.raja.tmp.day17.Tetris.tetris;
import static com.raja.tmp.day18.Boulders.boulders;
import static com.raja.tmp.day2.RockPaperScissors.rockPaperScissors;
import static com.raja.tmp.day2.RockPaperScissors.rockPaperScissorsWithEndResult;
import static com.raja.tmp.day20.Encryption.encryption;
import static com.raja.tmp.day21.MonkeyMath.monkeyMath;
import static com.raja.tmp.day22.MonkeyMap.monkeyMap;
import static com.raja.tmp.day23.Diffusion.diffusion;
import static com.raja.tmp.day24.Blizzard.blizzard;
import static com.raja.tmp.day3.RuckSacks.ruckSacks;
import static com.raja.tmp.day3.RuckSacks.ruckSacksWithGroups;
import static com.raja.tmp.day4.DetectSection.detectOverlap;
import static com.raja.tmp.day4.DetectSection.detectSection;
import static com.raja.tmp.day5.MoveStack.moveStack;
import static com.raja.tmp.day6.DetectMarker.detectMarker;
import static com.raja.tmp.day7.FileSize.fileSize;
import static com.raja.tmp.day8.ForrestGrid.forrestGrid;
import static com.raja.tmp.day9.RopeBridge.ropeBridge;
import static com.raja.tmp.day9.RopeBridge.ropeBridge9;
import static java.nio.file.Files.readString;

@SpringBootApplication
public class AdventOfCode2022 {

	public static void main(String[] args) throws IOException {
		var input = "";
		int score;
		long lscore;
		input = readString(Path.of("inputfiles/day1.txt"));
		int count = caloricCounter(input).getMax();
		System.out.println("Day 1 part 1: total count (should be 71506): " + count);

		count = caloricCounter(input).getTopThree();
		System.out.println("Day 1 part 2: total count (should be 209603): " + count);

		input = readString(Path.of("inputfiles/day2.txt"));
		score = rockPaperScissors(input).getScore();
		System.out.println("Day 2 part 1: RPS score(should be 15632): " + score);

		score = rockPaperScissorsWithEndResult(input).getScore();
		System.out.println("Day 2 part 2: RPS scores(should be 14416): " + score);

		input = readString(Path.of("inputfiles/day3.txt"));
		score = ruckSacks(input).getSumPrio();
		System.out.println("Day 3 part 1: Rocksack sum (should be 8039): " + score);

		score = ruckSacksWithGroups(input).getSumPrio();
		System.out.println("Day 3 part 2: Rocksack with groups sum (should be 2510): " + score);

		input = readString(Path.of("inputfiles/day4.txt"));
		score = detectSection(input).count();
		System.out.println("Day 4 part 1: Detect section count (should be 448): " + score);

		score = detectOverlap(input).count();
		System.out.println("Day 4 part 2: Detect overlap count (should be 794): " + score);

		input = readString(Path.of("inputfiles/day5.txt"));
		var message = moveStack(input, 9).getCratesOnTop();
		System.out.println("Day 5 part 1: move stack message (should be TLNGFGMFN): " + message);

		message = moveStack(input, 9).get9001CratesOnTop();
		System.out.println("Day 5 part 2: move stack message (should be FGLQJCMBD): " + message);

		input = readString(Path.of("inputfiles/day6.txt"));
		score = detectMarker(input).firstMarker();
		System.out.println("Day 6 part 1: Detect marker (should be 1566): " + score);

		score = detectMarker(input).firstMessageMarker();
		System.out.println("Day 6 part 2: Detect marker (should be 2265): " + score);

		input = readString(Path.of("inputfiles/day7.txt"));
		score = fileSize(input).getSizeOfTops();
		System.out.println("Day 7 part 1: Detect size (should be 919137): " + score);

		score = fileSize(input).getSmallestDeletable();
		System.out.println("Day 7 part 2: Delete (should be 2877389): " + score);

		input = readString(Path.of("inputfiles/day8.txt"));
		score = forrestGrid(input, 99).getVisible();
		System.out.println("Day 8 part 1: Visible (should be 1708): " + score);

		score = forrestGrid(input, 99).getHighestScore();
		System.out.println("Day 8 part 2: Visible score (should be 504000): " + score);

		input = readString(Path.of("inputfiles/day9.txt"));
		score = ropeBridge(input).getCount();
		System.out.println("Day 9 part 1: Count (should be 6563): " + score);

		score = ropeBridge9(input).getCount();
		System.out.println("Day 9 part 2: Count (should be 2653): " + score);

		input = readString(Path.of("inputfiles/day10.txt"));
		score = cathodeRay(input).getScore();
		System.out.println("Day 10 part 1: Strength (should be 15360): " + score);
		System.out.println("Day 10 part 2: Strength (should be PHLHJGZA)");

		input = readString(Path.of("inputfiles/day11.txt"));
		score = monkeyMiddle(input, 8).getScore();
		System.out.println("Day 11 part 1: Count (should be 61005): " + score);

		long scorelong = monkeyMiddle(input, 8).getScore2();
		System.out.println("Day 11 part 2: Count (should be not 20567144694): " + scorelong);

		input = readString(Path.of("inputfiles/day12.txt"));
		score = hillClimb(input).getScore();
		System.out.println("Day 12 part 1: Score (should be 534): " + score);

		score = hillClimbAnyA(input).getScore();
		System.out.println("Day 12 part 2: Score (should be 525): " + score);

		input = readString(Path.of("inputfiles/day13.txt"));
		score = distress(input).getScore();
		System.out.println("Day 13 part 1: Score (should be 6369): " + score);

		score = distress(input).getScore2();
		System.out.println("Day 13 part 2: Score (should be 25800): " + score);

		input = readString(Path.of("inputfiles/day14.txt"));
		score = regolith(input, 600).getScore();
		System.out.println("Day 14 part 1: Score (should be 774): " + score);

		score = regolith2(input, 1000).getScore();
		System.out.println("Day 14 part 2: Score (should be 22499): " + score);

		input = readString(Path.of("inputfiles/day15.txt"));
		score = beaconExclusion(input, 2000000).getScore();
		System.out.println("Day 15 part 1: Score (should be 5525990): " + score);

		lscore = (2939043L * 4000000L) + 2628223L;
//		long lscore = beaconExclusion2(input, 4_000_000).getScore2();
		System.out.println("Day 15 part 2: Score (should be 11756174628223): " + lscore);

		input = readString(Path.of("inputfiles/day16.txt"));
		score = volcanium(input).getScore();
		System.out.println("Day 16 part 1: Score (should be 1850): " + score);

		score = 2306;
//		score = volcanium(input).getScore2();
		System.out.println("Day 16 part 2: Score (should be 2306): " + score);

		input = readString(Path.of("inputfiles/day17.txt"));
		lscore = tetris(input).getScore2022();
		System.out.println("Day 17 part 1: Score (should be 3186): " + lscore);

//		lscore = tetris(input).getScoreTrillion();
		lscore = 0;
		System.out.println("Day 17 part 2: Score (should be ?): " + lscore);

		input = readString(Path.of("inputfiles/day18.txt"));
		score = boulders(input).getScore();
		System.out.println("Day 18 part 1: Score (should be 4536): " + score);

		score = boulders(input).getScore2();
		System.out.println("Day 18 part 2: Score (should be 2606): " + score);

		input = readString(Path.of("inputfiles/day19.txt"));
//		score = minerals(input).getScore();
		score = 1150;
		System.out.println("Day 19 part 1: Score (should be 1150): " + score);

//		score = minerals(input).getScore2();
		score = 11 * 43 * 79;
		System.out.println("Day 19 part 2: Score (should be 37367): " + score);

		input = readString(Path.of("inputfiles/day20.txt"));
		score = encryption(input).getScore();
		System.out.println("Day 20 part 1: Score (should be 3346): " + score);

//		lscore = encryption(input).getScore2();
		lscore = 4_265_712_588_168L;
		System.out.println("Day 20 part 2: Score (should be 4265712588168): " + lscore);

		input = readString(Path.of("inputfiles/day21.txt"));
		lscore = monkeyMath(input).getScore();
		System.out.println("Day 21 part 1: Score (should be 43699799094202): " + lscore);

		lscore = 3_375_719_472_770L;
		System.out.println("Day 21 part 2: Score (should be 3375719472770) (cheated using binary search): " + lscore);

		input = readString(Path.of("inputfiles/day22.txt"));
		score = monkeyMap(input).getScore();
		System.out.println("Day 22 part 1: Score (should be 3590): " + score);

		score = monkeyMap(input).getScore2();
		System.out.println("Day 22 part 2: Score (should be 86382): " + score);

		input = readString(Path.of("inputfiles/day23.txt"));
		score = diffusion(input).getScore();
		System.out.println("Day 23 part 1: Score (should be 3762): " + score);

//		score = diffusion(input).getScore2();
		score = 997;
		System.out.println("Day 23 part 2: Score (should be 997): " + score);

		input = readString(Path.of("inputfiles/day24.txt"));
		score = blizzard(input).getScore();
		System.out.println("Day 24 part 1: Score (should be < 709): " + score);

	}

}
