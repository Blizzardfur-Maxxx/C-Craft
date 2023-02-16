import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try (BufferedInputStream in = new BufferedInputStream(new URL("https://piston-data.mojang.com/v1/objects/43db9b498cb67058d2e12d394e6507722e71bb45/client.jar").openStream());
				  FileOutputStream fileOutputStream = new FileOutputStream("minecraft.jar")) {
				    byte dataBuffer[] = new byte[1024];
				    int bytesRead;
				    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				        fileOutputStream.write(dataBuffer, 0, bytesRead);
				    }
				    try (BufferedInputStream in1 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput.jar").openStream());
							  FileOutputStream fileOutputStream1 = new FileOutputStream("jinput.jar")) {
							    byte dataBuffer1[] = new byte[1024];
							    int bytesRead1;
							    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
							        fileOutputStream.write(dataBuffer, 0, bytesRead);
							    }
							    try (BufferedInputStream in2 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl_util.jar").openStream());
										  FileOutputStream fileOutputStream2 = new FileOutputStream("lwjgl_util.jar")) {
										    byte dataBuffer2[] = new byte[1024];
										    int bytesRead2;
										    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
										        fileOutputStream.write(dataBuffer, 0, bytesRead);
										    }
										    try (BufferedInputStream in3 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl.jar").openStream());
													  FileOutputStream fileOutputStream3 = new FileOutputStream("lwjgl.jar")) {
													    byte dataBuffer3[] = new byte[1024];
													    int bytesRead3;
													    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
													        fileOutputStream.write(dataBuffer, 0, bytesRead);
													    }
													    try (BufferedInputStream in4 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl.dll").openStream());
																  FileOutputStream fileOutputStream4 = new FileOutputStream("lwjgl.dll")) {
																    byte dataBuffer4[] = new byte[1024];
																    int bytesRead4;
																    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																        fileOutputStream.write(dataBuffer, 0, bytesRead);
																    }
																    try (BufferedInputStream in5 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl64.dll").openStream());
																			  FileOutputStream fileOutputStream5 = new FileOutputStream("lwjgl64.dll")) {
																			    byte dataBuffer5[] = new byte[1024];
																			    int bytesRead5;
																			    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																			        fileOutputStream.write(dataBuffer, 0, bytesRead);
																			    }
																			    try (BufferedInputStream in6 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-raw.dll").openStream());
																						  FileOutputStream fileOutputStream6 = new FileOutputStream("jinput-raw.dll")) {
																						    byte dataBuffer6[] = new byte[1024];
																						    int bytesRead6;
																						    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																						        fileOutputStream.write(dataBuffer, 0, bytesRead);
																						    }
																						    try (BufferedInputStream in7 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-raw_64.dll").openStream());
																									  FileOutputStream fileOutputStream7 = new FileOutputStream("jinput-raw_64.dll")) {
																									    byte dataBuffer7[] = new byte[1024];
																									    int bytesRead7;
																									    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																									        fileOutputStream.write(dataBuffer, 0, bytesRead);
																									    }
																									    try (BufferedInputStream in8 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-dx8_64.dll").openStream());
																												  FileOutputStream fileOutputStream8 = new FileOutputStream("jinput-dx8_64.dll")) {
																												    byte dataBuffer8[] = new byte[1024];
																												    int bytesRead8;
																												    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																												        fileOutputStream.write(dataBuffer, 0, bytesRead);
																												    }
																												    try (BufferedInputStream in9 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-dx8.dll").openStream());
																															  FileOutputStream fileOutputStream9 = new FileOutputStream("jinput-dx8.dll")) {
																															    byte dataBuffer9[] = new byte[1024];
																															    int bytesRead9;
																															    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																															        fileOutputStream.write(dataBuffer, 0, bytesRead);
																															    }
																															    try (BufferedInputStream in10 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/OpenAL32.dll").openStream());
																																		  FileOutputStream fileOutputStream10 = new FileOutputStream("OpenAL32.dll")) {
																																		    byte dataBuffer10[] = new byte[1024];
																																		    int bytesRead10;
																																		    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																																		        fileOutputStream.write(dataBuffer, 0, bytesRead);
																																		    }
																															    }} catch (IOException e) {
																															    	// handle exception
																															    }
																																		    try (BufferedInputStream in11 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/OpenAL64.dll").openStream());
																																					  FileOutputStream fileOutputStream11 = new FileOutputStream("OpenAL6.dll")) {
																																					    byte dataBuffer11[] = new byte[1024];
																																					    int bytesRead11;
																																					    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
																																					        fileOutputStream.write(dataBuffer, 0, bytesRead);
																																					    }
																																		    }
																									    }
																						    }
																						   
																			    }
																    }
													    }
										    }
							    }
				    }
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
																																					    
								

					