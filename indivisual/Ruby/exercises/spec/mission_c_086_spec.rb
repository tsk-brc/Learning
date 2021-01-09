require './app/mission_c_086.rb'

describe '母音削除チェック' do
  describe '出力結果のテスト' do
    let(:missionC086) { MissionC086.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "Ruby\n" }
      expect($stdout).to receive(:puts).with('Rby')
      missionC086.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "PROGRAMMING\n" }
      expect($stdout).to receive(:puts).with('PRGRMMNG')
      missionC086.run
    end
  end
end
