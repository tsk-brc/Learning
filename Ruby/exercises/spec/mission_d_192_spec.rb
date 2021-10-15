require './app/mission_d_192.rb'

describe '感嘆符付加チェック' do
  describe '出力結果のテスト' do
    let(:missionD192) { MissionD192.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "Programming\n"
      expect($stdout).to receive(:puts).with('Programming!')
      missionD192.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "A\n"
      expect($stdout).to receive(:puts).with('A!')
      missionD192.run
    end
  end
end
