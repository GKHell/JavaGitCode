
from pygame import mixer
from tkinter import *
import glob
import RegisterCode

root = Tk(className="RootMusic")
root.geometry("500x300")
class MyApp:
	def __init__(self,root):

		self.songs = glob.glob("/home/you/Music/*.wav")
		Button(root,text="Pre",command = lambda : self.prev()).pack()
		Button(root,text="play",command = lambda : self.play()).pack()
		Button(root,text="Next",command = lambda : self.next()).pack()
		Button(root,text="register",command=lambda : self.reg()).pack()
		self.i = 0
	def reg(self):
		RegisterCode.codeYou()
		

	def play(self):
		mixer.init();
		mixer.music.load(self.songs[self.i])
		mixer.music.play()

	def next(self):
		self.i = self.i+1
		if self.i >= len(self.songs):
			self.i = 0 #reset song to first song
		self.play()
		
	def prev(self):
		self.i = self.i - 1
		if self.i < 0:
			self.i = len(self.songs)-1 #reset to last song
		self.play()

MyApp(root)
root.mainloop()