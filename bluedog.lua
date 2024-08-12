i=0;
input = {};

while true do
	savestate.loadslot(1);
	emu.frameadvance();
	emu.frameadvance();
	emu.frameadvance();
	savestate.saveslot(1);

	input['P1 A'] = true;
	joypad.set(input);
	emu.frameadvance();
	input['P1 A'] = false;
	joypad.set(input);
	emu.frameadvance();
	
	for j=0,2750 do
		gui.text(0,0,i);
		emu.frameadvance();
	end

	i=i+1;
end