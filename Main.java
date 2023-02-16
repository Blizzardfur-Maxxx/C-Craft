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
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
				    try (BufferedInputStream in1 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput.jar").openStream());
							  FileOutputStream fileOutputStream1 = new FileOutputStream("jinput.jar")) {
							    byte dataBuffer1[] = new byte[1024];
							    int bytesRead1;
							    while ((bytesRead1 = in1.read(dataBuffer1, 0, 1024)) != -1) {
							        fileOutputStream1.write(dataBuffer1, 0, bytesRead1);
							    }
					} catch (IOException e) {
						// TODO Auto-generated catch block
					}
							    try (BufferedInputStream in2 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl_util.jar").openStream());
										  FileOutputStream fileOutputStream2 = new FileOutputStream("lwjgl_util.jar")) {
										    byte dataBuffer2[] = new byte[1024];
										    int bytesRead2;
										    while ((bytesRead2 = in2.read(dataBuffer2, 0, 1024)) != -1) {
										        fileOutputStream2.write(dataBuffer2, 0, bytesRead2);
										    }
								} catch (IOException e) {
									// TODO Auto-generated catch block
								}
										    try (BufferedInputStream in3 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl.jar").openStream());
													  FileOutputStream fileOutputStream3 = new FileOutputStream("lwjgl.jar")) {
													    byte dataBuffer3[] = new byte[1024];
													    int bytesRead3;
													    while ((bytesRead3 = in3.read(dataBuffer3, 0, 1024)) != -1) {
													        fileOutputStream3.write(dataBuffer3, 0, bytesRead3);
													    }
											} catch (IOException e) {
												// TODO Auto-generated catch block
											}
													    try (BufferedInputStream in4 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl.dll").openStream());
																  FileOutputStream fileOutputStream4 = new FileOutputStream("lwjgl.dll")) {
																    byte dataBuffer4[] = new byte[1024];
																    int bytesRead4;
																    while ((bytesRead4 = in4.read(dataBuffer4, 0, 1024)) != -1) {
																        fileOutputStream4.write(dataBuffer4, 0, bytesRead4);
																    }
														} catch (IOException e) {
															// TODO Auto-generated catch block
														}
																    try (BufferedInputStream in5 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/lwjgl64.dll").openStream());
																			  FileOutputStream fileOutputStream5 = new FileOutputStream("lwjgl64.dll")) {
																			    byte dataBuffer5[] = new byte[1024];
																			    int bytesRead5;
																			    while ((bytesRead5 = in5.read(dataBuffer5, 0, 1024)) != -1) {
																			        fileOutputStream5.write(dataBuffer5, 0, bytesRead5);
																			    }
																	} catch (IOException e) {
																		// TODO Auto-generated catch block
																	}
																			    try (BufferedInputStream in6 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-raw.dll").openStream());
																						  FileOutputStream fileOutputStream6 = new FileOutputStream("jinput-raw.dll")) {
																						    byte dataBuffer6[] = new byte[1024];
																						    int bytesRead6;
																						    while ((bytesRead6 = in6.read(dataBuffer6, 0, 1024)) != -1) {
																						        fileOutputStream6.write(dataBuffer6, 0, bytesRead6);
																						    }
																				} catch (IOException e) {
																					// TODO Auto-generated catch block
																				}
																						    try (BufferedInputStream in7 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-raw_64.dll").openStream());
																									  FileOutputStream fileOutputStream7 = new FileOutputStream("jinput-raw_64.dll")) {
																									    byte dataBuffer7[] = new byte[1024];
																									    int bytesRead7;
																									    while ((bytesRead7 = in7.read(dataBuffer7, 0, 1024)) != -1) {
																									        fileOutputStream7.write(dataBuffer7, 0, bytesRead7);
																									    }
																							} catch (IOException e) {
																								// TODO Auto-generated catch block
																							}
																									    try (BufferedInputStream in8 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-dx8_64.dll").openStream());
																												  FileOutputStream fileOutputStream8 = new FileOutputStream("jinput-dx8_64.dll")) {
																												    byte dataBuffer8[] = new byte[1024];
																												    int bytesRead8;
																												    while ((bytesRead8 = in8.read(dataBuffer8, 0, 1024)) != -1) {
																												        fileOutputStream8.write(dataBuffer8, 0, bytesRead8);
																												    }
																										} catch (IOException e) {
																											// TODO Auto-generated catch block
																										}
																												    try (BufferedInputStream in9 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/jinput-dx8.dll").openStream());
																															  FileOutputStream fileOutputStream9 = new FileOutputStream("jinput-dx8.dll")) {
																															    byte dataBuffer9[] = new byte[1024];
																															    int bytesRead9;
																															    while ((bytesRead9 = in9.read(dataBuffer9, 0, 1024)) != -1) {
																															        fileOutputStream9.write(dataBuffer9, 0, bytesRead9);
																															    }
																													} catch (IOException e) {
																														// TODO Auto-generated catch block
																													}
																															    try (BufferedInputStream in10 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/OpenAL32.dll").openStream());
																																		  FileOutputStream fileOutputStream10 = new FileOutputStream("OpenAL32.dll")) {
																																		    byte dataBuffer10[] = new byte[1024];
																																		    int bytesRead10;
																																		    while ((bytesRead10 = in10.read(dataBuffer10, 0, 1024)) != -1) {
																																		        fileOutputStream10.write(dataBuffer10, 0, bytesRead10);
																																		    }
																																} catch (IOException e) {
																																	// TODO Auto-generated catch block
																																}
																																		    try (BufferedInputStream in11 = new BufferedInputStream(new URL("https://raw.githubusercontent.com/Blizzardfur-Maxxx/Assets-For-Projetcs/main/OpenAL64.dll").openStream());
																																					  FileOutputStream fileOutputStream11 = new FileOutputStream("OpenAL6.dll")) {
																																					    byte dataBuffer11[] = new byte[1024];
																																					    int bytesRead11;
																																					    while ((bytesRead11 = in11.read(dataBuffer11, 0, 1024)) != -1) {
																																					        fileOutputStream11.write(dataBuffer11, 0, bytesRead11);
																																					    }
																																			} catch (IOException e) {
																																				// TODO Auto-generated catch block
																																			}
																																		    }
																									    }
																																					    
								

					